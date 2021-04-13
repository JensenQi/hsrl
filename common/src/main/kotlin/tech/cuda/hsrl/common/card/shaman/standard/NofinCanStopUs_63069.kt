package tech.cuda.hsrl.common.card.shaman.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class NofinCanStopUs_63069 : Card() {
    override val id = 63069
    override val name = "鱼勇可贾"
    override val description = "使你的所有随从获得+1/+1。使你的鱼人额外获得+1/+1。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "“欲勇者，贾鱼余勇！”"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/cfb133ab312087ec7b21420bf4aa6d25a7848b5612ac1b4d15a3ed63146240f3.png"
}
