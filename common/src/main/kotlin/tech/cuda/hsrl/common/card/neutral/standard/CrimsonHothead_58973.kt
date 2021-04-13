package tech.cuda.hsrl.common.card.neutral.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CrimsonHothead_58973 : Card() {
    override val id = 58973
    override val name = "赤红急先锋"
    override val description = "<b>法术迸发：</b>获得+1攻击力和<b>嘲讽</b>。"
    override var cost: Int? = 4
    override var health: Int? = 6
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Dragon
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "对法术是真的热爱。"
    override val artist = "Mauricio Herrera"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/4f47199152fa763e77188361ed821bfc9f64f0b26e9a4441dcda7f171c3c8314.png"
}
