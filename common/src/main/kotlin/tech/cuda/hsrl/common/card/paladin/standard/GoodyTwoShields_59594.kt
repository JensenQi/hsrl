package tech.cuda.hsrl.common.card.paladin.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GoodyTwoShields_59594 : Card() {
    override val id = 59594
    override val name = "双盾优等生"
    override val description = "<b>圣盾，法术迸发：</b>获得<b>圣盾</b>。"
    override var cost: Int? = 3
    override var health: Int? = 2
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "考试当天带上一根油条和两块盾，你也能成为优等生。"
    override val artist = "Anton Zemskov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/11a6b95f7688d32caddd4d4dc04c064fd313ac65710a55859c4af571c737e687.png"
}
