package tech.cuda.hsrl.common.card.neutral.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Showstopper_61299 : Card() {
    override val id = 61299
    override val name = "砸场游客"
    override val description = "<b>亡语：</b><b>沉默</b>所有随从。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "这场演出太要命啦！"
    override val artist = "Ian Ameling"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c3317cb3021fd3bee32a12c9dd7238e4f48e0a963ecd975ffccac438c8a56066.png"
}
