package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BrassKnuckles_40438 : Card() {
    override val id = 40438
    override val name = "黄铜指虎"
    override val description = "在你的英雄攻击后，随机使你手牌中的一张随从牌获得+1/+1。"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Weapon
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.Msog
    override val background = "指虎隐蔽性强，方便携带，是污手党干活的好帮手。"
    override val artist = "Anton Kagounkina"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e47abcc65944978c46b18162e8ae4f7d9e98cb9c0da47a0f4e72d960d19ae0c9.png"
}
