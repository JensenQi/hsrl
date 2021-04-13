package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GrimNecromancer_69721 : Card() {
    override val id = 69721
    override val name = "冷酷的死灵法师"
    override val description = "<b>战吼：</b>召唤两个1/1的骷髅。"
    override var cost: Int? = 4
    override var health: Int? = 4
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Core
    override val background = "警告：该骷髅任何时候都无法爆炸。"
    override val artist = "Dave Allsop"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/5420778592f2aa523ac38e9056a047021f8670a4e165db7312bba7b65a075fde.png"
}
