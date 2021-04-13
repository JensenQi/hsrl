package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FreeFromAmber_42009 : Card() {
    override val id = 42009
    override val name = "琥口脱险"
    override val description = "<b>发现</b>一张法力值消耗大于或等于（8）点的随从牌，并召唤该随从。"
    override var cost: Int? = 8
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.Ungoro
    override val background = "城镇猎人多，我要回丛林。丛林路也滑，地形更复杂。"
    override val artist = "Anton Kagounkina"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7b3dd54d2bd3a905140f59b53be7d0f891fdf24e55e63b474b87d788525ce745.png"
}
