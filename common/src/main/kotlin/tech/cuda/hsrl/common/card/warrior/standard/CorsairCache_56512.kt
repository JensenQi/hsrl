package tech.cuda.hsrl.common.card.warrior.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CorsairCache_56512 : Card() {
    override val id = 56512
    override val name = "海盗藏品"
    override val description = "抽一张武器牌。使其获得+1耐久度。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.AshesOfOutland
    override val background = "海盗最喜欢的藏宝地点是哪儿？是牌库最底下！"
    override val artist = "Ludo Lullabi"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/8119d0553d5da5828d34bc8dbd7b91775f2003302864ee63070807a7f74c8f5e.png"
}
