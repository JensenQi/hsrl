package tech.cuda.hsrl.common.card.mage.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GlacierRacer_61958 : Card() {
    override val id = 61958
    override val name = "冰川竞速者"
    override val description = "<b>法术迸发：</b>对所有已被<b>冻结</b>的敌人造成3点伤害。"
    override var cost: Int? = 1
    override var health: Int? = 3
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "没了超人战服，终究是差点味道。"
    override val artist = "Agatha Zhou"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/bd31bca912a50deae775d5f9fc340e54da4bcf1a9dfc2c9811053c970be9d7ad.png"
}
