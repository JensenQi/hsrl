package tech.cuda.hsrl.common.card.shaman.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DeathmatchPavilion_61228 : Card() {
    override val id = 61228
    override val name = "死斗场帐篷"
    override val description = "召唤一个3/2的决斗者。在本回合中，如果你的英雄进行过攻击，则再召唤一个。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "打来打去，都是为了最终的奖品毛绒玩具。"
    override val artist = "J. Cheung & A. Bozonnet"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e36d7b915d38a34aade24f25c9adced07c31ad2adbc3901f13407f6d03a2630f.png"
}
