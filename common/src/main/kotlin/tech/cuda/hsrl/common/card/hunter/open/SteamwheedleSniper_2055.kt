package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SteamwheedleSniper_2055 : Card() {
    override val id = 2055
    override val name = "热砂港狙击手"
    override val description = "你的英雄技能能够以随从为目标。"
    override var cost: Int? = 2
    override var health: Int? = 3
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.Gvg
    override val background = "地精一般都不喜欢使用狙击枪，他们都喜欢直接用炸药解决问题。"
    override val artist = "Jun Kang"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/5d821366ed4310d6991154bcff77f04fe5cc28024cc6da144ae7ab6d3a087108.png"
}
