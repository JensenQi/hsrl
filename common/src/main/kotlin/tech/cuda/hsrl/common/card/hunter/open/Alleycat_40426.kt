package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Alleycat_40426 : Card() {
    override val id = 40426
    override val name = "雄斑虎"
    override val description = "<b>战吼：</b>召唤一个1/1的雌斑虎。"
    override var cost: Int? = 1
    override var health: Int? = 1
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.Msog
    override val background = "看到那两颗金牙没，钱都是你出的。"
    override val artist = "Anton Zemskov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c994a2570e1cba1dffd67e563c362841f3faf63c0270967878eb47ce560da281.png"
}
