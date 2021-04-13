package tech.cuda.hsrl.common.card.paladin.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GuardianOfKings_69528 : Card() {
    override val id = 69528
    override val name = "列王守卫"
    override val description = "<b>嘲讽</b>，<b>战吼：</b>为你的英雄恢复 6点生命值。"
    override var cost: Int? = 7
    override var health: Int? = 7
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.Core
    override val background = "神圣的造物从天而降...真是老掉牙的剧情！"
    override val artist = "E. M. Gist"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/70a5090005cdaed37ac2df4c125382ce2fde8e55861ff2f2d26d51ff07ff4873.png"
}
