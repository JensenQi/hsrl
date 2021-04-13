package tech.cuda.hsrl.common.card.demonhunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Glide_60153 : Card() {
    override val id = 60153
    override val name = "滑翔"
    override val description = "将你的手牌洗入你的牌库，抽四张牌。<b>流放：</b>使你的对手做出相同行为。"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Demonhunter
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "“我的爱好是滑雪，你呢？” “滑翔……”"
    override val artist = "Slawomir Maniak"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/82c1d0b9b120f57a82a8a9ba53998e0526b1f835bff1aa36d7ca39d25c6a733c.png"
}
