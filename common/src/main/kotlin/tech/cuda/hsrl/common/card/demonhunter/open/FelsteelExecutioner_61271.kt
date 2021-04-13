package tech.cuda.hsrl.common.card.demonhunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FelsteelExecutioner_61271 : Card() {
    override val id = 61271
    override val name = "魔钢处决者"
    override val description = "<b>腐蚀：</b>变为武器牌。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Elemental
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Demonhunter
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "“小时候，我想拥有一把自己的武器。我的母亲告诉我：‘我看你像武器！’”"
    override val artist = "Jakub Kasper"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/17f580ff02e1b170acdfd4dad1801bee8ca9e2519271e7b44f866fcf5e652008.png"
}
