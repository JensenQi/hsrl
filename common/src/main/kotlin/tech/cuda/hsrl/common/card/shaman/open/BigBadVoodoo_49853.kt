package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BigBadVoodoo_49853 : Card() {
    override val id = 49853
    override val name = "终极巫毒"
    override val description = "使一个友方随从获得“<b>亡语：</b>随机召唤一个法力值消耗增加（1）点的随从。”"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.RastakhansRumble
    override val background = "现已推出适合鱼人的套餐：儿童巫毒。"
    override val artist = "L. Lullabi & K. Turovec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/5aa8c0f14b85a8c24ceb08bb152a0ff187895ea6c1a0d39a83818f836cea7c70.png"
}
