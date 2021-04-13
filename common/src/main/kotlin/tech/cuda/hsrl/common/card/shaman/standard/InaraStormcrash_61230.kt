package tech.cuda.hsrl.common.card.shaman.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class InaraStormcrash_61230 : Card() {
    override val id = 61230
    override val name = "伊纳拉·碎雷"
    override val description = "在你的回合时，你的英雄获得+2攻击力和<b>风怒</b>。"
    override var cost: Int? = 5
    override var health: Int? = 5
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "伊纳拉是观众的最爱，总能收获雷鸣般的掌声。"
    override val artist = "Jim Nelson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d59336ba70ef346010fd01b42d1772ee86735e9ed6b70acf1a7ead438fef882a.png"
}
