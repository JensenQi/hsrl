package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class OptimisticOgre_61625 : Card() {
    override val id = 61625
    override val name = "乐观的食人魔"
    override val description = "50%几率攻击正确的敌人。"
    override var cost: Int? = 5
    override var health: Int? = 7
    override var attack: Int? = 6
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "“打错了怎么办？”“可要是打对了呢？”"
    override val artist = "Mike Sass"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f74d4cafdd908adc346094af8ba04ca58eaaf23033db37318f72c31ba7020865.png"
}
