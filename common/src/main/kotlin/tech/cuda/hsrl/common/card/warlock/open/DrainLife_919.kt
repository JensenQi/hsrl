package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DrainLife_919 : Card() {
    override val id = 919
    override val name = "吸取生命"
    override val description = "造成 2点伤害，为你的英雄恢复 2点生命值。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.Legacy1635
    override val background = "“我只是减少了你一年的寿命而已。”"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/1f6093d032f348d81633aba88b84f6308a9ecffcf3846f10ec76cfeabcf88f93.png"
}
