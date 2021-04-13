package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GetawayKodo_40587 : Card() {
    override val id = 40587
    override val name = "战术撤离"
    override val description = "<b>奥秘：</b>当一个友方随从死亡时，将其移回你的手牌。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.Msog
    override val background = "留得青山在，不怕没架打！"
    override val artist = "Rudy Siswanto"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/2ddac2ff7332805765c21d460e8e50d7e1c243c94b3b2d31156ccbecd1593865.png"
}
