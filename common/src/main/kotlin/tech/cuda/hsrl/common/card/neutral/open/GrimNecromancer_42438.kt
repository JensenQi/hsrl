package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GrimNecromancer_42438 : Card() {
    override val id = 42438
    override val name = "冷酷的死灵法师"
    override val description = "<b>战吼：</b>召唤两个1/1的骷髅。"
    override var cost: Int? = 4
    override var health: Int? = 4
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Kotf
    override val background = "警告：该骷髅任何时候都无法爆炸。"
    override val artist = "Dave Allsop"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7e54dbfd66f67876b3202b0884ad958be45f1ab662553678dd227fdf2e2434a3.png"
}
