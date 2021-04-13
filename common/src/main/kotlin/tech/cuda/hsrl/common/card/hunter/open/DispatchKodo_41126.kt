package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DispatchKodo_41126 : Card() {
    override val id = 41126
    override val name = "驮运科多兽"
    override val description = "<b>战吼：</b>造成等同于该随从攻击力的伤害。"
    override var cost: Int? = 4
    override var health: Int? = 4
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.Msog
    override val background = "驮运科多兽背负的不仅仅是琳琅满目的货物，更是贩夫走卒们一家的生计。"
    override val artist = "Luca Zontini"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/92522a78a3d7b5cc4d5f339ab103547aad98094316924181989e06ec7597a064.png"
}
