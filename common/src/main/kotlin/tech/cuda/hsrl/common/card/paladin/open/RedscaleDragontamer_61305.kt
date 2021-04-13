package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class RedscaleDragontamer_61305 : Card() {
    override val id = 61305
    override val name = "赤鳞驯龙者"
    override val description = "<b>亡语：</b>抽一张龙牌。"
    override var cost: Int? = 2
    override var health: Int? = 3
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Murloc
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "三个扩展包之前，芬利爵士让这项工作轻松了许多……"
    override val artist = "Arthur Bozonnet"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/57e979d888bb86889a0fe6b46886dd29f393ea7592ade9353045e0ad00cdb063.png"
}
