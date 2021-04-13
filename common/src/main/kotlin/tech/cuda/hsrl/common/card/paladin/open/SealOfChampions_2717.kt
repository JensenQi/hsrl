package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SealOfChampions_2717 : Card() {
    override val id = 2717
    override val name = "英勇圣印"
    override val description = "使一个随从获得+3攻击力和 <b>圣盾</b>。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.Tgt
    override val background = "“更快！更高！更强！”——英勇圣印"
    override val artist = "Jonboy Meyers"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/3399f3c7449f90c14887e483d59ea966f64a361f9b2cb0a22a4f4faa5b839247.png"
}
