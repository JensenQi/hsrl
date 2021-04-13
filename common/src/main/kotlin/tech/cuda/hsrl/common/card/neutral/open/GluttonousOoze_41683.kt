package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GluttonousOoze_41683 : Card() {
    override val id = 41683
    override val name = "贪食软泥怪"
    override val description = "<b>战吼：</b>摧毁对手的武器，并获得等同于其攻击力的护甲值。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Ungoro
    override val background = "三度蝉联“安戈洛吃武器大赛”的冠军。"
    override val artist = "A. J. Nazzaro"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/0c7ec45584e54cee2a3ce700cc6c799d34ecf5257a817d9ae3d43181aa2539dc.png"
}
