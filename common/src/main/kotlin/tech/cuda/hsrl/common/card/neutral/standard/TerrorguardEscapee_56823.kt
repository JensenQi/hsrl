package tech.cuda.hsrl.common.card.neutral.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TerrorguardEscapee_56823 : Card() {
    override val id = 56823
    override val name = "逃脱的恐惧卫士"
    override val description = "<b>战吼：</b>为你的对手召唤三个1/1的女猎手。"
    override var cost: Int? = 3
    override var health: Int? = 7
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Demon
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.AshesOfOutland
    override val background = "可怜的小家伙吓坏了，看看他的小脸儿……们。"
    override val artist = "Mauricio Herrera"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/99089de4f92769d0ca66b1ed06a9a9765a7bf65907544ef9d7482ec4458079d6.png"
}
