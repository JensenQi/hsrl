package tech.cuda.hsrl.common.card.demonhunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class StarStudentStelina_59395 : Card() {
    override val id = 59395
    override val name = "明星学员斯特里娜"
    override val description = "<b>流放：</b>检视你对手的三张手牌。将其中一张洗入对手的牌库。"
    override var cost: Int? = 4
    override var health: Int? = 3
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Demonhunter
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "所谓作弊，不过是“合理”地利用了你的资源。"
    override val artist = "Anton Zemskov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ab2b15af10349fff74dc2e8c95ad0cee722127d06b5247421c3177b6def7ba92.png"
}
