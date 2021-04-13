package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CascadingDisaster_61254 : Card() {
    override val id = 61254
    override val name = "连环灾难"
    override val description = "随机消灭一个敌方随从。<b>腐蚀：</b>消灭两个。<b>再次腐蚀：</b>消灭三个。"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "在怪物停稳前，请不要把身体四肢伸出车厢外。"
    override val artist = "L. Lullabi & K. Turovec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c31003e67d7f72d7edc026ffe0d527d926d4024def483d770b7a4285592d9615.png"
}
