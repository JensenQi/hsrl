package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class RecklessFlurry_46026 : Card() {
    override val id = 46026
    override val name = "鲁莽风暴"
    override val description = "消耗你所有的护甲值。对所有随从造成等同于所消耗护甲值数量的伤害。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "你看，谨慎风暴根本没有这个好用。"
    override val artist = "Arthur Gimaldinov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/923b9fe9ceaa534d5797bfd8eb3ad130c99fd1391d0a81ddccde9c15cf6c7ecb.png"
}
