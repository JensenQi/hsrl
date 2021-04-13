package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class KhartutDefender_53409 : Card() {
    override val id = 53409
    override val name = "卡塔图防御者"
    override val description = "<b>嘲讽，复生，亡语：</b>为你的英雄恢复 3点生命值。"
    override var cost: Int? = 6
    override var health: Int? = 4
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "“卡——塔嚏！”“祝福你！”"
    override val artist = "MAR Studio"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/980d2d46e0e25a9b78a4ba45848683b25a08ec3c19e60119db3be9808294dcad.png"
}
