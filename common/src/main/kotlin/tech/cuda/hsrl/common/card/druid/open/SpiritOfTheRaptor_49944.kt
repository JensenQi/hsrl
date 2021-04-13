package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SpiritOfTheRaptor_49944 : Card() {
    override val id = 49944
    override val name = "迅猛龙之灵"
    override val description = "<b>潜行</b>一回合。在你的英雄攻击并消灭一个随从后，抽一张牌。"
    override var cost: Int? = 1
    override var health: Int? = 3
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.RastakhansRumble
    override val background = "“罗缇！放下！这个不能咬，乖罗缇！真乖！”"
    override val artist = "Christopher Hayes"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/33b6c11b782a24b8b9d2533f29746f38c1c5a892f6ed70f914b5f52ce5b291d7.png"
}
