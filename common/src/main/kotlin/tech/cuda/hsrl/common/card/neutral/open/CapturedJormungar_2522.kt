package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CapturedJormungar_2522 : Card() {
    override val id = 2522
    override val name = "俘获的冰虫"
    override val description = ""
    override var cost: Int? = 7
    override var health: Int? = 9
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Tgt
    override val background = "你可以把它养着做宠物。但你要保证每天准点喂食，还要清理它的水缸！"
    override val artist = "Gonzalo Ordonez"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/1922f703479478f041274463d50b0bcd18b53b4c15bf17784972b1b29f600082.png"
}
