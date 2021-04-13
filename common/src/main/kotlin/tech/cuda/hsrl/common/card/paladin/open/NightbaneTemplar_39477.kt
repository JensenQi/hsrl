package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class NightbaneTemplar_39477 : Card() {
    override val id = 39477
    override val name = "夜魇骑士"
    override val description = "<b>战吼：</b>如果你的手牌中有龙牌，便召唤两条1/1的雏龙。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.Karazhan
    override val background = "她原本想要加入蓝龙骑士团的，可谁又能拒绝传送门的诱惑呢？"
    override val artist = "Luke Mancini"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f44d0ac226fb24db359517781f656570c87526054fb30dd6cf85f5b3983e2148.png"
}
