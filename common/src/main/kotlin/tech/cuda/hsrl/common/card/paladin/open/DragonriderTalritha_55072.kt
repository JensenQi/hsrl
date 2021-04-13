package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DragonriderTalritha_55072 : Card() {
    override val id = 55072
    override val name = "龙骑士塔瑞萨"
    override val description = "<b>亡语：</b>使你手牌中的一张龙牌获得+3/+3以及此<b>亡语</b>。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.DescentOfDragons
    override val background = "遇到问题不能一味地逃避。除非你总能换到新的巨龙坐骑。"
    override val artist = "Paul Mafayon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/236eb771b8973fa7932568898fd51c95f1b1e82038b95e2741da84bbb79216de.png"
}
