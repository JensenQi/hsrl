package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DruidOfTheFlame_2292 : Card() {
    override val id = 2292
    override val name = "烈焰德鲁伊"
    override val description = "<b>抉择：</b>将该随从变形成为5/2；或者将该随从变形成为2/5。"
    override var cost: Int? = 3
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.Brm
    override val background = "这些德鲁伊们在诺森德战斗了很久，所以特别容易受到拉格纳罗斯的引诱；一杯热腾腾的巧克力就能让他们就范。"
    override val artist = "Stanley Lau"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/1e4525a96a9e38428d0ee83aa8db6671a45a5774200779d68417c1e4fbb9bcc4.png"
}
