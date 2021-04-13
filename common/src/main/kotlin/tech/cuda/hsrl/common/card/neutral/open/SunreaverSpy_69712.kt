package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SunreaverSpy_69712 : Card() {
    override val id = 69712
    override val name = "夺日者间谍"
    override val description = "<b>战吼：</b>如果你控制一个<b>奥秘</b>，便获得+1/+1。"
    override var cost: Int? = 2
    override var health: Int? = 3
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Core
    override val background = "她看着你呢。一直看着你。"
    override val artist = "L. Lullabi & K. Turovec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/dd552fcc373a4c3f42407aefdfe740c628072464e6ff88a2a6cdd5f2949dbf19.png"
}
