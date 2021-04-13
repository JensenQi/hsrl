package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BluegillWarrior_68398 : Card() {
    override val id = 68398
    override val name = "蓝鳃战士"
    override val description = "<b>冲锋</b>"
    override var cost: Int? = 2
    override var health: Int? = 1
    override var attack: Int? = 2
    
    override val isClassic = true
    override val isStandard = false

    override val minionType = MinionType.Murloc
    override val type = CardType.Minion
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "他只是想要一个拥抱。一个黏黏的...滑滑的...拥抱。"
    override val artist = "Jakub Kasper"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/571cda48bb439160e4391dffb3dae5f12b0fb126d327994ac2d67cc54d93bd15.png"
}
