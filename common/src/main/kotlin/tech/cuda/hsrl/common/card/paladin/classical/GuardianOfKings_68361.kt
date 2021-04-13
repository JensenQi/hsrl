package tech.cuda.hsrl.common.card.paladin.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GuardianOfKings_68361 : Card() {
    override val id = 68361
    override val name = "列王守卫"
    override val description = "<b>战吼：</b>为你的英雄恢复 6点生命值。"
    override var cost: Int? = 7
    override var health: Int? = 6
    override var attack: Int? = 5
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.ClassicCards
    override val background = "神圣的造物从天而降...真是老掉牙的剧情！"
    override val artist = "E. M. Gist"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/155b9528fb37085e269dd2239d0e6774fca5dc63e251d120012bed796dc0dd8e.png"
}
