package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DarkmoonStatue_61677 : Card() {
    override val id = 61677
    override val name = "暗月雕像"
    override val description = "你的其他随从获得+1攻击力。<b>腐蚀：</b>该随从获得+4攻击力。"
    override var cost: Int? = 3
    override var health: Int? = 5
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "“希拉斯”被腐蚀之后，终于伸出了黑手。"
    override val artist = "Jakub Kasper"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/52c08b0a00bee57fb20f90dba85ad47f16ad18346fe69c527f92c5218d20733d.png"
}
