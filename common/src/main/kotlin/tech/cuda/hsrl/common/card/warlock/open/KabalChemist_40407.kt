package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class KabalChemist_40407 : Card() {
    override val id = 40407
    override val name = "暗金教炼金师"
    override val description = "<b>战吼：</b>随机将一张药水牌置入你的手牌。"
    override var cost: Int? = 4
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.Msog
    override val background = "你有病吗？我有药啊。"
    override val artist = "Mike Azevedo"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d90ed09a116034197941a644f996eeae69cb65f7440f7862f6deeb9f89fe6833.png"
}
