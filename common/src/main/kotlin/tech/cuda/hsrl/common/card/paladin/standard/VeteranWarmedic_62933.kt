package tech.cuda.hsrl.common.card.paladin.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class VeteranWarmedic_62933 : Card() {
    override val id = 62933
    override val name = "战地医师老兵"
    override val description = "在你施放一个神圣法术后，召唤一个2/2并具有<b>吸血</b>的医师。"
    override var cost: Int? = 4
    override var health: Int? = 5
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "战争时期，军医也会带上自己的专属军医。"
    override val artist = "Wayne Wu"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/34aec0133b36c3b735715d48db3e15262240e2416066a8b0f607ac3a4882e07a.png"
}
