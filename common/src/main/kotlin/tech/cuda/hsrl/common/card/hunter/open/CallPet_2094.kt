package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CallPet_2094 : Card() {
    override val id = 2094
    override val name = "召唤宠物"
    override val description = "抽一张牌。如果该牌是野兽牌，则其法力值消耗 减少（4）点。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.Gvg
    override val background = "无论身在何处，能够驯服野兽的技巧都是一个猎人最大的财富。"
    override val artist = "E. M. Gist"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/30c20a6b96e432a46488ed3e9e82b200195c04df368d21a2fc1196bf8f5fb83f.png"
}
