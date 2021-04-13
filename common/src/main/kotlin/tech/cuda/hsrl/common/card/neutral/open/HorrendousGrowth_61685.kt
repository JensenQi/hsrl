package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class HorrendousGrowth_61685 : Card() {
    override val id = 61685
    override val name = "恐怖增生体"
    override val description = "<b>腐蚀：</b>获得+1/+1。可以被无限<b>腐蚀</b>。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "别碰！越碰越严重。"
    override val artist = "Dave Allsop"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/6e12efc1c5a19cccdbce2bfc21fc4a3facab48ff6b7353e4eecdf990e4e6f9b4.png"
}
