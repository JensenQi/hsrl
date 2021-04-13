package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FandralStaghelm_38318 : Card() {
    override val id = 38318
    override val name = "范达尔·鹿盔"
    override val description = "你的<b>抉择</b>牌和英雄技能可以同时拥有两种效果。"
    override var cost: Int? = 4
    override var health: Int? = 5
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.Wotog
    override val background = "每当范达尔·鹿盔举起酒杯，并以“想当年我在种世界之树的时候……”为开场白在那老调重弹时，众酒客便会作鸟兽散。"
    override val artist = "Anton Zemskov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c774e8ca1bf1292bd6badb2dfcf6a35622a5e019693685af0caccdcddd7277c9.png"
}
