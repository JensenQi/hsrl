package tech.cuda.hsrl.common.card.paladin.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Barricade_61943 : Card() {
    override val id = 61943
    override val name = "路障"
    override val description = "召唤一个2/4并具有<b>嘲讽</b>的护卫。如果它是你唯一的一个随从，再召唤一个。"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "联盟和部落携手合作，加强了赛场的防火能力。"
    override val artist = "Ivan Fomin"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/89dd8ec58d00e233c92a212842097b2351b9e901ec9ac12ac1ac065312f90813.png"
}
