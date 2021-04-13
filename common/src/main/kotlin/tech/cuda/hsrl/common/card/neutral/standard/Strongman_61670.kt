package tech.cuda.hsrl.common.card.neutral.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Strongman_61670 : Card() {
    override val id = 61670
    override val name = "大力士"
    override val description = "<b>嘲讽，腐蚀：</b>法力值消耗为（0）点。"
    override var cost: Int? = 7
    override var health: Int? = 6
    override var attack: Int? = 6
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "看上去确实很霸气，后来大家发现那其实是一桶氦气。"
    override val artist = "Peter Stapleton"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/8ddba02b3b3da90c42833604a929367ccad4d28aab3fd284347f0ee61eab97fa.png"
}
