package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DaringReporter_40741 : Card() {
    override val id = 40741
    override val name = "勇敢的记者"
    override val description = "每当你的对手抽一张牌时，便获得+1/+1。"
    override var cost: Int? = 4
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Msog
    override val background = "即便受到死亡威胁，她追寻真相的决心也毫不动摇！"
    override val artist = "Sojin Hwang"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/9452684e0835cf626d0b5be06e58995ad13d3e87dc88041a760eedbd312ed76a.png"
}
