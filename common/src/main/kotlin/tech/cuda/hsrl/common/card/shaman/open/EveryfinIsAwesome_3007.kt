package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class EveryfinIsAwesome_3007 : Card() {
    override val id = 3007
    override val name = "鱼人恩典"
    override val description = "使你的所有随从获得+2/+2。你每控制一个鱼人，该牌的法力值消耗便减少（1）点。"
    override var cost: Int? = 7
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.Loe
    override val background = "如果你们的文明是要我们卑躬屈膝，那我们就让你们见识鱼人的骄傲！"
    override val artist = "Andrius Matijoshius"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/9a3dd8670e17d2fe9395806edc043028652dd49be79cd21739ba0a54e1718ec9.png"
}
