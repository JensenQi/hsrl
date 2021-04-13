package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CyclopianHorror_39041 : Card() {
    override val id = 39041
    override val name = "巨型独眼怪"
    override val description = "<b>嘲讽，战吼：</b>每有一个敌方随从，便获得+1生命值。"
    override var cost: Int? = 4
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Wotog
    override val background = "如此炯炯有神的大眼睛，瞪谁谁倒霉。"
    override val artist = "Garrett Hanna"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/9c9458189dfff06b3c0559f431ca98d4da91d4f68afa8d853e32ae26d97de53b.png"
}
