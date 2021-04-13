package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DreamingDrake_61963 : Card() {
    override val id = 61963
    override val name = "迷梦幼龙"
    override val description = "<b>嘲讽</b>，<b>腐蚀：</b>获得+2/+2。"
    override var cost: Int? = 3
    override var health: Int? = 4
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Dragon
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "有些龙的梦想是征服艾泽拉斯，有些龙的梦想只是成为5/6。"
    override val artist = "Mauricio Herrera"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/2a5b2bfb12d20a1633fe667e3a851b06e4e0e50d9068d9dfcd018f34e375e740.png"
}
