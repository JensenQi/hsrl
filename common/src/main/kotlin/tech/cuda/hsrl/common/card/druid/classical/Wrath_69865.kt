package tech.cuda.hsrl.common.card.druid.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Wrath_69865 : Card() {
    override val id = 69865
    override val name = "愤怒"
    override val description = "<b>抉择：</b> 对一个随从造成 3点伤害；或者造成 1点伤害并抽一张牌。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.ClassicCards
    override val background = "棘齿城酒馆里的人们纷纷表示，这张牌太强了，应该是传说级别的。"
    override val artist = "Raymond Swanland"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/687a7bc69b15e45a5b76c03c3ace24f9d343b3772d054505757ade24e9c8178a.png"
}
