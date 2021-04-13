package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DoublingImp_48116 : Card() {
    override val id = 48116
    override val name = "双生小鬼"
    override val description = "<b>战吼：</b>召唤一个该随从的复制。"
    override var cost: Int? = 3
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Demon
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.BoomsdayProject
    override val background = "在实验室发现两只小鬼不可怕，可怕的是只发现了一只。"
    override val artist = "Dave Allsop"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/23d02adf47094b9cde1a2093168db486107c811acad7cea3efdc1dacb0ccef55.png"
}
