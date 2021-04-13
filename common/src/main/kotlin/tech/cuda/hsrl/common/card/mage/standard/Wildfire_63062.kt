package tech.cuda.hsrl.common.card.mage.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Wildfire_63062 : Card() {
    override val id = 63062
    override val name = "野火"
    override val description = "使你的英雄技能的伤害提高1点。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "贫瘠之地原本是一片繁茂的丛林。后来就发生了这种事。"
    override val artist = "David Kegg"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/a084fee7a95a9b3d5a849dfc195a1a5b15c86318302a22f363af8a7882c649f6.png"
}
