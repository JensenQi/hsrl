package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class HolyFire_1365 : Card() {
    override val id = 1365
    override val name = "神圣之火"
    override val description = "造成 5点伤害。为你的英雄恢复 5点生命值。"
    override var cost: Int? = 6
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.Legacy4
    override val background = "紧接着你就会看到“神圣之烟”！"
    override val artist = "Miguel Coimbra"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/be921d513e6f7fa11ad7927394ab2804963dfc6eb57bd1c85fd063ddb3ae395b.png"
}
