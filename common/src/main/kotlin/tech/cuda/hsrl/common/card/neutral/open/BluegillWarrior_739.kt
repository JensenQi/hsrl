package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BluegillWarrior_739 : Card() {
    override val id = 739
    override val name = "蓝鳃战士"
    override val description = "<b>冲锋</b>"
    override var cost: Int? = 2
    override var health: Int? = 1
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Murloc
    override val type = CardType.Minion
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy1635
    override val background = "他只是想要一个拥抱。一个黏黏的...滑滑的...拥抱。"
    override val artist = "Jakub Kasper"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/88e01ae79a5fa798aed53724c41b9ce265833cae749d69fb32ae4c22baa4ed9d.png"
}
